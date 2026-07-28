# capability-crypto-tls

Atomic authority package for `crypto/tls`.

- imports: `#{:tls-server-end-point :tls-open}`
- effects: `#{:secret :network-write :crypto}`
- default policy: `:approval-required`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
