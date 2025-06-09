const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmww028/",
            name: "ssmww028",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmww028/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "吃了吗管理系统"
        } 
    }
}
export default base
