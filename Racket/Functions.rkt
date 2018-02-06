#lang racket

; Anonymus functions examples
((lambda (x y) (+ x y)) 1 2)
((lambda (x y) (* x y)) 2 3)
((lambda (x y) (- x y)) 3 5)
((lambda x x) 1 2 3 4)
((lambda (x y) (/ x y)) 2 4)

; Closures examples
(define (make-mult x) (lambda (y) (* x y)))
(let ([two-mult (make-mult 2)]
      [ten-mult (make-mult 10)])
     (print (two-mult 2))
     (newline)
     (print (ten-mult 5)))
     (newline)

(define (take-away x) (lambda (y) (- x y)))
(let ([take-two (take-away 2)]
      [take-ten (take-away 10)])
     (print (take-two 4))
     (newline)
     (print (take-ten 10)))
     (newline)

(define (add x) (lambda (y) (+ x y)))
(let ([add-two (add 2)]
      [add-four (add 4)])
     (print (add-two 4))
     (newline)
     (print (add-four 10)))
     (newline)

(define (divide x) (lambda (y) (/ x y)))
(let ([divide-ten (divide 10)]
      [divide-twenty (divide 20)])
     (print (divide-ten 5))
     (newline)
     (print (divide-twenty 20)))
     (newline)

(define (cmplx x) (lambda (y) (+ x y)))
(let ([complex-two (cmplx +2i)]
      [complex-four (cmplx +4i)])
     (print (complex-two 5))
     (newline)
     (print (complex-four 10)))
     (newline)
  
; Currying examples
(define (triple-add x y z) (+ x y z))
((curry triple-add) 2 4 6)

(define (divi x y) (/ x y))
((curry divi) 6)
(((curry divi) 6) 8)

(define (mult x y) (* x y))
(((curry mult) 5) 10)

(define (subt x y) (- x y))
(((curry subt) 10) 5)

(define (print-full-name x y) (~a print x y))
(((curry print-full-name) "George") "Suarez")

; Partial application examples
(define (plus x y) (+ x y))
(define curried-add (curry plus))
(((curried-add) 2) 4)

(define (multi x y) (* x y))
(define curried-multi (curry multi))
(((curried-multi) 4) 2)

(define (square x) (* x x))
(define curried-square (curry square))
((curried-square) 2)

(define (minus x y) (- x y))
(define curried-subt (curry minus))
(((curried-subt) 4) 2)

(define (mult-add x y z) (* x (+ y z)))
(define curried-mult-add  (curry mult-add))
((((curried-mult-add) 2) 4) 5)

; Functions as parameters examples
(define (do-twice f x) (f (f x)))
(define (squared n) (* n n))
(do-twice squared 2)

(define (print-twice f x) (f (f x)))
(define (output x) (~a x x))
(print-twice output "Hello")

(define (print-eight-smiles f x) (f (f (f x))))
(print-eight-smiles output ":)")

(define (quadraple f x) (f (f x)))
(define (double x) (* x x))
(quadraple double 2)

(define (double-add f x) (f x))
(define (sum x) (+ x x))
(double-add sum 10)
 
; Functions returning functions examples
(define (combine-str x) (lambda (y) (~a x y)))
(define greet (combine-str "Hello, "))
(greet "George")

(define (make-more x) (lambda (y) (+ x y)))
(define add-five (make-more 5))
(add-five 10)

(define (make-less x) (lambda (y) (- x y)))
(define sub-ten (make-less 10))
(sub-ten 5)

(define (divide-more x) (lambda (y) (/ x y)))
(define divide-two (divide-more 2))
(divide-two 2)

(define (multiply x) (lambda (y) (* x y)))
(define get-even-number (multiply 2))
(get-even-number 3)

