(ns euler.level1.problem008)

(defn euler-8 [digits n]
  (loop [digits digits max-val 0]
    (if (empty? digits)
      max-val
      (recur (rest digits) (max (apply * (take n digits)) max-val)))))