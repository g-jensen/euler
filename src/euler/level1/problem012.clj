(ns euler.level1.problem012)

(defn divisor-count [n]
  (* 2 (count (filter #(zero? (mod n %)) (range 1 (Math/sqrt n))))))

(defn lazy-triangles
  ([] (lazy-triangles 1))
  ([n] (cons (/ (* n (inc n)) 2) (lazy-seq (lazy-triangles (inc n))))))

(defn euler-12 [n]
  (first (filter #(< n (divisor-count %)) (lazy-triangles))))
