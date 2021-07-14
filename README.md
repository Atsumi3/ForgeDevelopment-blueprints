# ForgeDevelopment-blueprints

Minecraft Forge で Mod を作るときの最小構成.  
- buildSrc 導入
  - ライブラリバージョン情報の管理
- IntelliJ IDEA
- Kotlin
- マルチモジュール
  - 一つのプロジェクトで複数のModを開発
  
## Version
Minecraft 1.16.5  
MinecraftForge 1.16.5-36.1.32

更新時は以下のファイルを弄る  
buildSrc/src/main/java/dependencies/Dep.kt

## 注意点

### ModId

forgeでModの認識に使われる値.

英数大文字は使えない.  
利用できる例: 
- mod_practice
- modpractice


