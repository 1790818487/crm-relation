// 引入Vue和Vue Router
import Vue from 'vue';
import VueRouter from 'vue-router';
import axios from "axios";
import ElementUI from "element-ui";

// 创建Vue Router实例
const router = new VueRouter({
    // 配置选项
});

// 定义路由规则
router.map({
    '/': {
        component: HomeComponent
    },
    '/about': {
        component: AboutComponent
    }
});

// 挂载路由实例
Vue.use(VueRouter);
Vue.use(axios);
Vue.use(ElementUI);
new Vue({
    router,
    render: h => h(App)
}).$mount('#app');