(ns euler.level1.problem002)

(defn fibs
  ([] (fibs 0 1))
  ([n m] (cons m (lazy-seq (fibs m (+ m n))))))

(defn even-fibs
  ([] (even-fibs 0 2))
  ([n m] (cons m (lazy-seq (even-fibs m (+ (* 4 m) n))))))

(defn euler-2 [n]
  (reduce + (take-while #(< % n) (even-fibs))))

(defn euler-2-easy [n]
  (loop [i 1 j 1 acc 0]
    (if (< j n)
      (if (even? j)
        (recur j (+ i j) (+ acc j))
        (recur j (+ i j) acc))
      acc)))