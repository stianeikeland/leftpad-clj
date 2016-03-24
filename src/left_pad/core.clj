(ns left-pad.core)

(defn leftpad
  "Left pad string with spaces, making it at least len long."
  [mystr len]
  (format (str "%" len "s") mystr))
