(ns euler.level1.problem011)

(defn in-range? [start end value]
  (and (<= start value) (> end value)))

(defn evaluate-grid [grid x y]
  (if (and (in-range? 0 (count grid) x)
           (in-range? 0 (count grid) y))
    (nth (nth grid y) x)
    0))

(defn products-of-adjacents [grid x y]
  [(apply * (map #(evaluate-grid grid (+ % x) y) (range 0 4)))
   (apply * (map #(evaluate-grid grid (+ % x) (+ % y)) (range 0 4)))
   (apply * (map #(evaluate-grid grid x (+ % y)) (range 0 4)))
   (apply * (map #(evaluate-grid grid (- x %) (+ y %)) (range 0 4)))])

(defn euler-11 [grid]
  (apply max
         (flatten (for [x (range 0 (count grid))
                        y (range 0 (count grid))]
                    (products-of-adjacents grid x y)))))
