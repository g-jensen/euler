(ns euler.level1.problem007)

(defn factor-of? [n m]
  (zero? (mod m n)))

(defn prime? [n]
  (cond
    (<= n 1) false
    (= n 2) true
    :else (every? #(not (factor-of? % n)) (range 2 (inc (Math/sqrt n))))))

(defn euler-7 [n]
  (loop [i 1 m 2]
    (cond
      (>= i n) m
      (prime? (inc m)) (recur (inc i) (inc m))
      :else (recur i (inc m)))))