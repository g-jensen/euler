(ns euler.level1.problem014)

(defn next-collatz [n]
  (if (even? n)
    (quot n 2)
    (inc (* 3 n))))

(defn collatz-seq [n]
  (if (= n 1)
    [1]
    (cons n (lazy-seq (collatz-seq (next-collatz n))))))

(defn collatz-seq-count [n]
  (count (collatz-seq n)))

(defn euler-14 [n]
  (apply max-key collatz-seq-count (range 1 n)))