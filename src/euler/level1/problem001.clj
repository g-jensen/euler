(ns euler.level1.problem001)

(defn multiple-of-3-or-5? [n]
  (or (= 0 (mod n 3))
      (= 0 (mod n 5))))

(defn euler-1 [n]
  (loop [m 1 acc 0]
    (if (< m n)
      (if (multiple-of-3-or-5? m)
        (recur (inc m) (+ acc m))
        (recur (inc m) acc))
      acc)))
