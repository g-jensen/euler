(ns euler.level1.problem005)

(defn gcd [n m]
  (loop [n n m m]
    (if (zero? m)
      n
      (recur m (mod n m)))))

(defn lcm
  ([n m] (/ (* n m) (gcd n m)))
  ([v] (reduce lcm v)))

(defn euler-5 [n]
  (lcm (range 2 (inc n))))