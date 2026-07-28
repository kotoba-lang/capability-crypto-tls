(ns kotoba.capability.crypto.tls
  "Importable contract for crypto/tls.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:tls-server-end-point :tls-open}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :approval-required, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z3Rg9Wmr1RiGapTg8NzVRCg46teq8", :capability/repository "kotoba-lang/capability-crypto-tls", :capability/id "crypto/tls", :capability/effects #{:secret :network-write :crypto}, :capability/provider-status :contract-only})
