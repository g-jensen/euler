(ns euler.level1.problem013)

(defn euler-13 [n list]
  (subs (str (apply + list)) 0 n))
