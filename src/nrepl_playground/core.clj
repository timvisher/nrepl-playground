(ns nrepl-playground.core)

(comment

  ;; This could be the seedbed of an analog to slime-apropos-package
  (with-open [w (java.io.StringWriter.)]
    (binding [*out* w]
      (doseq [publics-in-ns (map ns-publics (all-ns))]
        (dorun
         (map (comp #'clojure.repl/print-doc meta second) publics-in-ns))))
    (.toString w))

  )
