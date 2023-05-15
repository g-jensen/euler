(ns euler.level1.problem004)

(defn pop-last-digit [n]
  (quot n 10))

(defn last-digit [n]
  (mod n 10))

(defn digits [n]
  (vec (reverse (loop [n n digits []]
    (if (zero? n)
      digits
      (recur (pop-last-digit n) (conj digits (last-digit n))))))))

(defn palindrome? [v]
  (cond
      (= 1 (count v)) true
      (= 2 (count v)) (= (first v) (last v))
      :else (and (= (first v) (last v))
                 (palindrome? (subvec (pop v) 1)))))

(defn palindrome? [v]
  (= v (reverse v)))

(defn max-num-with-digits [n]
  (dec (int (Math/pow 10 n))))

(defn min-num-with-digits [n]
  (dec (int (Math/pow 10 (dec n)))))

(defn euler-4 [n]
  (let [range (range (min-num-with-digits n) (max-num-with-digits n))]
    (apply max
           (filter #(palindrome? (digits %))
                   (for [i range j range] (* i j))))))
