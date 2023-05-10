(ns euler.level1.problem003)

(defn remove-factor [factor n]
  (if (> factor 1)
    (loop [n n]
      (if (zero? (mod n factor))
        (recur (/ n factor))
        n))
    n))

(defn prime-factors-recursive [n d]
  (if (zero? (mod n d))
    (cons d (prime-factors-recursive (remove-factor d n) (inc d)))
    (if (= n 1)
      '()
      (prime-factors-recursive n (inc d)))))

(defn prime-factors [n]
  (prime-factors-recursive n 2))

(defn euler-3 [n]
  (apply max (prime-factors n)))

(defn euler-3-easy [n]
  (let [limit (Math/sqrt n)]
    (loop [k n d 2 largest 1]
      (if (< d limit)
        (if (zero? (mod k d))
          (recur (remove-factor d k) (inc d) (max d largest))
          (recur k (inc d) largest))
        largest))))