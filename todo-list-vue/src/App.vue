<template>
  <v-app>
    <TodoHeader></TodoHeader>
    <TodoInput></TodoInput>
    <TodoList></TodoList>
    <TodoFooter></TodoFooter>
  </v-app>
</template>

<script>
import TodoHeader from './components/TodoHeader.vue';
import TodoInput from './components/TodoInput.vue';
import TodoList from './components/TodoList.vue';
import TodoFooter from './components/TodoFooter.vue';

export default {
  name: 'TodoList2',

  components: {
    'TodoHeader' : TodoHeader,
    'TodoInput' : TodoInput,
    'TodoList' : TodoList,
    'TodoFooter' : TodoFooter,
  },

}
</script>
