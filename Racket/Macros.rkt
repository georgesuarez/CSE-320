#lang racket

(define-syntax (for-loop stx)
  (syntax-case stx ()
    [(for-loop (var_name start end) b0)
     (if (identifier? #'var_name)
         #'(if (integer? start)
               (if (integer? end)
                   (for ([var_name (in-range start end)]) b0)
                   (raise-syntax-error #f
                                       "Not an integer"
                                       end))
               (raise-syntax-error #f
                                   "Not an integer"
                                   start))
         (raise-syntax-error #f
                             "Not an identifier"
                             #'var_name))]))
               
               
                   

            
                                 
                                 
                                 
         