# Changelog

## 0.1.0 (2026-03-20)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/compare/v0.0.1...v0.1.0)

### Features

* **client:** add connection pooling option ([262c6f0](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/262c6f06ffca4589839c1134e85318755bbb4260))
* **client:** add more convenience service method overloads ([c9f2d98](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/c9f2d9861e78aedf760a5307123f7ec048abcdd0))
* **client:** allow configuring dispatcher executor service ([ee5ba12](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/ee5ba122373a91853a02f648e2d79f3fa5c4ad27))
* **client:** send `X-Stainless-Kotlin-Version` header ([afbcfed](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/afbcfed2ef4db4eb879b538e4acde5549b72b13c))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([b24c199](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/b24c199920a6d3cb6812d1ca3bf238ed91d6d21c))
* **client:** disallow coercion from float to int ([a5b0b70](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/a5b0b70ed6c64a7e964b788429d445fb466fd94f))
* **client:** fully respect max retries ([99fb79e](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/99fb79e69355202787789110d15615b40a927ce6))
* **client:** incorrect `Retry-After` parsing ([ef8aea9](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/ef8aea9148adf2053496bae269085e290ee8db22))
* **client:** preserve time zone in lenient date-time parsing ([94546f0](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/94546f0e320cad92c856cb45fcf205875f495c20))
* **client:** send retry count header for max retries 0 ([99fb79e](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/99fb79e69355202787789110d15615b40a927ce6))
* date time deserialization leniency ([e450559](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/e450559d6041ea67c018f05678a12cab3c710253))
* **tests:** add missing query/header params ([bf42f71](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/bf42f71c4925ffb27211a4f9572ed10a980f977d))


### Chores

* **ci:** upgrade `actions/setup-java` ([ce82eb8](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/ce82eb8f438a1de87ddba7c944eca968f2b38c9d))
* drop apache dependency ([fcecec8](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/fcecec8a469d25ec58f0a604b5ea5f753b452ad0))
* **internal:** allow passing args to `./scripts/test` ([5ad9b39](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/5ad9b393f08b27c6ec87292f7b3bc7ea1c261f94))
* **internal:** bump ktfmt ([2492c47](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/2492c475ab8e43992653bdc5d46a55c8346c4792))
* **internal:** bump palantir-java-format ([5d4ce37](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/5d4ce37df3a6a31fa8bb6bfba6e01c504cc200c5))
* **internal:** codegen related update ([b60d661](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/b60d661798e6aac41501b5114da468dc4e951ac2))
* **internal:** codegen related update ([d67f734](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/d67f734402d62642055047e668456fc6f9a4afbf))
* **internal:** codegen related update ([a06486f](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/a06486f32db603002cdc9ef891311a621df0d710))
* **internal:** codegen related update ([07af80a](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/07af80a3aea53084d0291e9e0d8e09f13b5b27e9))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([eea3a33](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/eea3a332b8fd86ffd263491c62599e033e0b6d7e))
* **internal:** depend on packages directly in example ([99fb79e](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/99fb79e69355202787789110d15615b40a927ce6))
* **internal:** expand imports ([4a5fd39](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/4a5fd39fb9af164166615f87a01989cccd539721))
* **internal:** make `OkHttp` constructor internal ([bc393af](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/bc393afa06bc1b7ddd59f67f834f09f756a62a8e))
* **internal:** refactor build files to support future stainless package uploads ([6024a4f](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/6024a4f7fb7e5b3a48b3067531cc6882bae2c911))
* **internal:** remove mock server code ([f1ce41c](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/f1ce41c1f63a4c05c018f7f38f77767af705c0d4))
* **internal:** tweak CI branches ([74ef674](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/74ef674f3b7cb0925775cbbf52207db7cd2cefd5))
* **internal:** update `actions/checkout` version ([cd70de1](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/cd70de10007c9dda537b1d71cbf1537954f2e0b2))
* **internal:** update `TestServerExtension` comment ([b1a7022](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/b1a70220b3868f441385558c874a2750bbddaf74))
* **internal:** update retry delay tests ([fd6bb90](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/fd6bb90f51fc0fbb3abe8805f71d52bb0ff2ccd9))
* **internal:** upgrade AssertJ ([d0f62ae](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/d0f62ae004a2f302717f688649877cf5bd0a0ed3))
* make `Properties` more resilient to `null` ([415e4a7](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/415e4a7e3e37e781b7815719d7e67d1ebd53dffd))
* sync repo ([db34c4a](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/db34c4af675d9c7245525201b1da9b6c84a50433))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/issues/3240) in tests ([e450559](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/e450559d6041ea67c018f05678a12cab3c710253))
* update mock server docs ([fdbd22d](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/fdbd22da1edc4cacdb1094deac2333fab425e797))
* update placeholder string ([b0530b5](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/b0530b5449579823eec99327b75b2a963054a56e))
* update SDK settings ([d64728f](https://github.com/ummitsmerogers-droid/GetTrustedInstallerShell/commit/d64728faddd00d52ea2a33faae5453966524c9cb))
