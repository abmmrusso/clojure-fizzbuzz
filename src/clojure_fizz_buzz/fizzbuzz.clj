(ns clojure-fizz-buzz.fizzbuzz)

(defn fizzbuzz [finish]
  (map (fn [number]
          (cond
            (zero? (mod number 15)) "FizzBuzz"
            (zero? (mod number 3)) "Fizz"
            (zero? (mod number 5)) "Buzz"
            :else number))
  (range 1 (inc finish))))
