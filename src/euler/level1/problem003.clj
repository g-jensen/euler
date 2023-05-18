(ns euler.level1.problem003)

(defn remove-factor [factor n]
  (loop [n n]
    (if (and (zero? (mod n factor))
             (not= 1 factor))
      (recur (/ n factor))
      n)))

(defn prime-factors [n]
  (loop [n n d 2 v []]
    (cond
      (zero? (mod n d)) (recur (remove-factor d n) (inc d) (conj v d))
      (= n 1) v
      :else (recur n (inc d) v))))

(defn euler-3 [n]
  (apply max (prime-factors n)))

(defn euler-3-easy [n]
  (let [limit (Math/sqrt n)]
    (loop [k n d 2 largest 1]
      (cond
        (>= d limit) largest
        (zero? (mod k d)) (recur (remove-factor d k) (inc d) (max d largest))
        :else (recur k (inc d) largest)))))