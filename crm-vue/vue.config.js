const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  devServer: {
    port: 8089 // 设置端口为8080
  },
  transpileDependencies: true
})
