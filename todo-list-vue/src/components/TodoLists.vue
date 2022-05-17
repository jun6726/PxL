<template>
    <article>
        <ul class="todo-list__content">
            <li v-for = "todoItem in todoItems" v-bind:key="todoItem" class="todo-list__item">
                <v-btn class="todo-list__check-btn ma-2" color="secondary" dark>
                    <v-icon dark right>mdi-checkbox-marked-circle</v-icon>
                </v-btn>
                <span class="todo-list__info">{{ todoItem }}</span> 
                <v-btn color="warning" class="todo-list__remove-btn ma-2" dark v-on:click="removeTodo(todoItem,index)">
                    <v-icon>
                        mdi-minus-circle
                    </v-icon>
                </v-btn>
            </li>
        </ul>
    </article>
</template>

<style lang="scss" scoped>
.todo-list__content{
    display: block;
    width: 100%;
    padding: 0 1rem;
    .todo-list__item{
        display: flex;
        justify-content: space-between;
        align-content: center;
        width: 100%;
        height: 100%;
        margin-top: 1rem;
        padding-bottom: 1rem;
        border-bottom: 1px solid #ddd;
        .todo-list__info{
            display: block;
            padding: 1rem 0;
            height: 100%;
        }
    }
    .todo-list__remove-btn {
        padding: 0.5rem; 
    }    
}

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