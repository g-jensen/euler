(ns euler.level1.problem010
  (:require
    [euler.math :as math]))

(defn euler-10 [n]
  (apply + (filter math/prime? (range 2 n))))
