(ns com.cljmem.home
  (:require [com.cljmem.ui :as ui]
            [com.cljmem.settings :as settings]))


(defn home-page [ctx]
  (ui/page
    ctx
    [:h2.text-2xl.font-bold (str "Hello whup " settings/app-name)]
    )
  )


(def module
  {:routes [["" {:get home-page}
             ["/"                  {:get home-page}]] ]})
