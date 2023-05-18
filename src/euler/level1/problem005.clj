(ns euler.level1.problem005)

(defn greatest-common-divisor [n m]
  (loop [n n m m]
    (if (zero? m)
      n
      (recur m (mod n m)))))

(defn least-common-multiple
  ([n m] (/ (* n m) (greatest-common-divisor n m)))
  ([v] (reduce least-common-multiple v)))

(defn euler-5 [n]
  (least-common-multiple (range 2 (inc n))))