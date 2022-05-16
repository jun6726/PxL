<template>
  <footer class="clearAllContainer">
    <button class="clearAllBtn" v-on:click="clearTodo">Clear All !</button>
  </footer>
</template>

<style scope>
.clearAllContainer {
  width: 8.5rem;
  height: 50px;
  line-height: 50px;
  background-color: white;
  border-radius: 5px;
  margin: 0 auto;
}
.clearAllBtn {
  color: #e20303;
  display: block;
}
</style>

<script>
export default {
  methods: {
    clearTodo: function () {
      localStorage.clear();
    },
  },
};
</script>