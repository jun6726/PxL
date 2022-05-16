<template>
    <article>
        <ul>
            <li v-for = "todoItem in todoItems" v-bind:key="todoItem">
                {{ todoItem }}
                <button class="removeBtn" v-on:click="removeTodo(todoItem,index)">delete</button>
            </li>
        </ul>
    </article>
</template>

<style scoped>
.removeBtn{ border: 1px solid red; }
</style>

<script>
export default {
    data : function(){
        return{
            todoItems:[]
        }
    },
    methods: {
        removeTodo : function (todoItem,index) {
            localStorage.removeItem(todoItem);
            this.todoItems.splice(index,1)// 특정 인덱스에서 하나 지움
        }
    },


    created: function() {
        if (localStorage.length > 0){
            for (var i = 0; i < localStorage.length; i ++){
                if (localStorage.key(i) !== 'loglevel:webpack-dev-server'){
                    this.todoItems.push(localStorage.key(i));
                }
            }
        }
    },
}
</script>