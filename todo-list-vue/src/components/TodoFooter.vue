<template>
  <footer class="footer__clear-all-btn-container">
    <button class="footer__clear-all-btn" v-on:click="clearTodo">Clear All !</button>
  </footer>
</template>

<style lang="scss" scope>
.footer__clear-all-btn-container {
  width: 8.5rem;
  height: 50px;
  line-height: 50px;
  background-color: white;
  border-radius: 5px;
  margin: 0 auto;
  .footer__clear-all-btn {
    display: block;
    width: 100%;
    color: red;
    border: 1px solid red;
    padding: 0 1rem;
    margin-top: 4rem;
  }
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