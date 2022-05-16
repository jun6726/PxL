<template>
    <article>
        <input type="text" v-model="newTodoItem" v-on:keyup.enter = "addTodo">
        <v-btn elvation="2" v-on:click="addTodo" >add!</v-btn>
    </article>
</template>
<style scope>
    input{
        border: 2px solid green;
        padding: 16px;
        background-color:#eaeaea;
        }
</style>
<script>
    export default{
        data: function () {
            return { 
                newTodoItem: ""
            }
        },

        methods: {
            addTodo : function () {
                console.log (this.newTodoItem);
                localStorage.setItem(this.newTodoItem, this.newTodoItem); // 로컬스토리지 저장
                this.clearInput();
            },
            clearInput : function() {
                this.newTodoItem = "" // 초기화
            }
        },
    }
</script>