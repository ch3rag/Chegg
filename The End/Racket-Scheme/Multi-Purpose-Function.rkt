; A Multi-Purpose Function
; Arg: Argument That Changes The Behavior Of The Function
(define (multi-purpose arg)
  (cond
    ; If Arg Equals Name, Return Your Name
    ((eq? arg 'name) 'Mike)
    ; If Arg Equals Partners, Return The List Containing Name Of Your Lab Partners
    ((eq? arg 'partners) '(Larry James))
    ; If Arg Equals Comments, Return Your Comments About This Lab
    ((eq? arg 'comments) "It is very interesting!")
    ; For Every Other Value Arg, Return You Favorite Dining Hall Dish
    (#t 'Pasta)))

; Test
(multi-purpose 'name)
(multi-purpose 'partners)
(multi-purpose 'comments)
(multi-purpose 'joke)
