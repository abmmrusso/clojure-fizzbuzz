(ns clojure-fizz-buzz.fizzbuzz_test
  (:use clojure.test)
  (:use clojure-fizz-buzz.fizzbuzz)
)

(deftest fizzbuzz_test
  (is (=(seq '(1 2)) (fizzbuzz 2)))
  (is (=(seq '(1 2 "Fizz" 4 "Buzz" "Fizz" 7 8 "Fizz" "Buzz" 11 "Fizz" 13 14 "FizzBuzz")) (fizzbuzz 15)))
)
