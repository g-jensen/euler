(ns euler.level1.problem006)

(defn square [n]
  (* n n))

(defn square-of-sum [n]
  (square (apply + (range 0 (inc n)))))

(defn sum-of-squares [n]
  (apply + (map #(square %) (range 0 (inc n)))))

(defn euler-6 [n]
  (- (square-of-sum n)
     (sum-of-squares n)))