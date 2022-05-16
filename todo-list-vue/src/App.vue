<template>
  <v-app>
    <TodoHeader></TodoHeader>
    <TodoInput></TodoInput>
    <TodoLists></TodoLists>
    <TodoFooter></TodoFooter>
  </v-app>
</template>

<style scope>
@import url('https://fonts.googleapis.com/css2?family=Itim&display=swap');
html, body { font-family: 'Itim', sans-serif; }
#app { font-family: 'Itim', sans-serif;}
</style>

<script>
import TodoHeader from './components/TodoHeader.vue';
import TodoInput from './components/TodoInput.vue';
import TodoLists from './components/TodoLists.vue';
import TodoFooter from './components/TodoFooter.vue';

export default {
  components: {
    'TodoHeader' : TodoHeader,
    'TodoInput' : TodoInput,
    'TodoLists' : TodoLists,
    'TodoFooter' : TodoFooter,
  },
}
</script>
