; Returns True If Clara Can Eat This Dish
(define (can-clara-eat dish)
  (= (cadr dish) 1))

; Returns True If Isaiah Can Eat This Dish
(define (can-isaiah-eat dish)
  (= (caddr dish) 0))

; Returns True If Jasmine Can Eat This Dish
(define (can-jasmine-eat dish)
  (= (cadddr dish) 0))

; Returns True If Rafael Can Eat This Dish
(define (can-rafael-eat dish)
  (and (= (cadddr dish) 0) (= (car (cddddr dish)) 1)))

; Returns A List Of Dishes # That A Particular Person Can Eat
(define (list-of-dishes meal filter)
  (cond
    ; If Meal Is Empty, Return Empty List
    ((null? meal) '())
    ; Else Call Filter Function On Car Meal And If It's True,
    ; Cons # Dish Into A List
    ((filter (car meal)) (cons (car (car meal)) (list-of-dishes (cdr meal) filter)))
    (#t (list-of-dishes (cdr meal) filter))))

; Returns True If All Members Of List Satisfies A Function
(define (all x f)
  (cond
    ((null? x) #t)
    ((f (car x)) (all (cdr x) f))
    (#t #f)))

; Returns True If An Item Is Member Of The List
(define (is-member e x)
  (list? (member e x)))

; OR-S A List Of Booleans!
(define (or-list l)
  (if (null? l) #f
      (or (car l) (or-list (cdr l)))))

; Returns Whether The Meal Is Satisfactory Or Not
(define (satisfactory_meal meal)
  ; Craete A List-Of-List Of Dishes Which Can Be Eaten By Each Person
  (let ((edible-dishes (list
   (list-of-dishes meal can-clara-eat)
   (list-of-dishes meal can-isaiah-eat)
   (list-of-dishes meal can-jasmine-eat)
   (list-of-dishes meal can-rafael-eat)))
        ; List Of All Dish # In The Meal
        (all-dishes (map car meal)))
    ; Check If All Edible Dishes List Length > 3
    ; Means Every One Can Eat At Least 3 Dishes!
    (and
      (all edible-dishes (lambda (x) (>= (length x) 3)))
   ; Map Every Dish# Over A Function That Checks If The Dish# Is Member Of Edible Dishes
   ; For Example For First Dish# = 8, It Will Return (#F #T #T #T), Representing 8 Can Be Eaten By
   ; Isaiah, Jasmine, And Jasmine But Not Clara
   ; We Will Then Map Or On This List Of List And Finally Or The Final List
      (map (lambda (x)
            (map (lambda (y) (is-member x y)) edible-dishes)) all-dishes))))
     ;(or-list (map or-list (map (lambda (x)
      ;      (map (lambda (y) (is-member x y)) edible-dishes)) all-dishes))))))
     
    
     
   


(satisfactory_meal '(
     (8  0 0 0 1)
     (9  1 1 0 1)
     (23 1 0 0 1)
     (2  1 0 1 0)
     (6  0 0 1 1)
     (6  0 0 0 0)))


