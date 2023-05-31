(ns euler.level1.problem009)

(defn square [n]
  (* n n))

(defn euler-9 [n]
  (set
    (for [b (range 1 (inc n))
          c (range b (inc (- n b)))
          :let [a (- n b c)]
          :when (= (square c) (+ (square a) (square b)))]
      (* a b c))))