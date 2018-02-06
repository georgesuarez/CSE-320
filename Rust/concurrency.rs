use std::thread;
use std::sync::{Arc, Mutex};

struct Philosopher {
    name: String,
    left: usize,
    right: usize,
}

impl Philosopher {
    fn new(name: &str, left: usize, right: usize) -> Philosopher {
        Philosopher {
            name: name.to_string(),
            left: left,
            right: right,
        }
    }

    fn eat(&self, table: &Table) {
        let left_fork = table.forks[self.left].lock().unwrap();
        let right_fork = table.forks[self.right].lock().unwrap();

        println!("{} is eating", self.name);
        thread::sleep_ms(1000);
        println!("{} is done eating", self.name)
    }
}

struct Table {
    forks: Vec<Mutex<(i32)>>,
}

fn main() {
    let table = Arc::new(Table {
        forks: vec![
            Mutex::new(0),
            Mutex::new(1),
            Mutex::new(2),
            Mutex::new(3),
            Mutex::new(4),
        ],
    });

    let philosophers = vec![
        Philosopher::new("Judith Butler", 0, 1),
        Philosopher::new("Gilles Deleuze", 1, 2),
        Philosopher::new("Karl Marx", 2, 3),
        Philosopher::new("Emma Goldman", 3, 4),
        Philosopher::new("Michel Foucault", 0, 4),
    ];

    let handles: Vec<_> = philosophers
        .into_iter()
        .map(|p| {
            let table = table.clone();

            thread::spawn(move || {
                p.eat(&table);
            })
        })
        .collect();

    for h in handles {
        h.join().unwrap();
    }
}
