(set-env! :dependencies '[[degree9/meta "0.3.0-SNAPSHOT"]])
(require '[meta.boot :as m])

(m/initialize)

(deftask develop
  "Start local development."
  []
  (m/project :develop true))

(deftask build
  "Start production build."
  []
  (m/project :build true))
