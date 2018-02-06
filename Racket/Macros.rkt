#lang racket

(require control)

(define-syntax (for-loop stx)
  (syntax-case stx ()
    [(for-loop (var_name initial end) b0 b1 ...)
     (if (and (identifier? #'initial)
              (identifier? #'end))
         ; TODO: Implement for-loop procedure
         #'(for ([var_name (in-range initial end)]))
         (print "Error: Not an integer"))]))
         



;(define-syntax for-loop
;  (syntax-rules ()
;    [(for-loop (var-name initial-val end-val ...) b0 b1 ...)
;     (let ([var-name initial-val])
;       (until (equal? var-name end-val ...)
;              (print var-name)
;              (newline)
;              (set! var-name (+ var-name 1))))]))
    
                                 
                                 
                                 
         