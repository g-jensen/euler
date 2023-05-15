(ns euler.level1.problem006)

(defn sum-of-squares [n]
  (/ (* n (inc n) (inc (* 2 n))) 6))

(defn square [n]
  (* n n))

(defn square-of-sum [n]
  (square (/ (* n (inc n)) 2)))

(defn euler-6 [n]
  (- (square-of-sum n) (sum-of-squares n)))
