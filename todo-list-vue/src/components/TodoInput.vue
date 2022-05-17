<template>
    <article class="input-form__content">
        <input type="text" v-model="newTodoItem" v-on:keyup.enter = "addTodo">
        <v-btn class="input-form__add-btn" elvation="2" v-on:click="addTodo" color="secondary">add!</v-btn>
    </article>
</template>
<style lang="scss" scoped>
    .input-form__content{
        display: flex;
        justify-content: space-between;
        border-radius: 4px;
        overflow: hidden;
        margin-top: 4rem;
        padding: 0 1rem;
        input{
            width: 100%;
            border: 2px solid #03dac6;
        }
        .input-form__add-btn{
            margin-left: 1rem;
        }
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