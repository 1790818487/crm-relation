import App from './App.vue'

// 引入Vue和Vue Router
import Vue from 'vue';
import VueRouter from 'vue-router';

import ElementUI from "element-ui";
import 'element-ui/lib/theme-chalk/index.css';

//需要使用的模板
import MainComponent from "@/components/main/MainComponent"
// 定义路由规则
const routes = [
    //管理员用户访问的
    {
        path: '/',
        component: MainComponent,
    }
]

// 创建Vue Router实例
const router = new VueRouter({
    // 配置选项
    routes    // (缩写) 相当于 routes: routes
});

// 挂载路由实例
Vue.use(ElementUI)
    .use(VueRouter)

new Vue({
    el: '#app',
    router,
    render: h => h(App)
});

