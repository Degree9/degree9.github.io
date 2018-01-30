(set-env! :dependencies '[[degree9/meta "0.3.0-SNAPSHOT"]])
(require '[meta.boot :as m])

(m/initialize)

(deftask build
  "Start production build."
  []
  (comp
    (cljs)
    (target :dir #{"dist"})))

(deftask develop
  "Start local development."
  []
  (comp
    (watch)
    (build)))
