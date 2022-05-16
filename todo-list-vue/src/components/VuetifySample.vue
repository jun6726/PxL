<template>
  <v-container>
    <v-card class="overflow-hidden">
      <v-app-bar
        absolute
        color="blue-grey"
        elevate-on-scroll
        scroll-target="#scrolling-techniques-7"
      >
        <v-toolbar-title>ToDoList</v-toolbar-title>

        <v-spacer></v-spacer>
      </v-app-bar>
      <v-sheet
        id="scrolling-techniques-7"
        class="overflow-y-auto"
        max-height="600"
      >
        <v-container style="height: 1500px; margin-top: 64px">
          <v-list subheader two-line flat>
            <v-list-item-group v-model="settings" multiple>
              <!-- List -->
              <v-list-item>
                <template v-slot:default="{ active }">
                  <v-list-item-action>
                    <v-checkbox :input-value="active"></v-checkbox>
                  </v-list-item-action>

                  <v-list-item-content>
                    <v-list-item-title>Title</v-list-item-title>
                    <v-list-item-subtitle>subTitle</v-list-item-subtitle>
                  </v-list-item-content>
                </template>
              </v-list-item>
              <!--// List -->
              <!-- List -->
              <v-list-item>
                <template v-slot:default="{ active }">
                  <v-list-item-action>
                    <v-checkbox :input-value="active"></v-checkbox>
                  </v-list-item-action>

                  <v-list-item-content>
                    <v-list-item-title>Title</v-list-item-title>
                    <v-list-item-subtitle>subTitle</v-list-item-subtitle>
                  </v-list-item-content>
                </template>
              </v-list-item>
              <!--// List -->
            </v-list-item-group>
          </v-list>
        </v-container>
      </v-sheet>
    </v-card>
  </v-container>
</template>

<style>
/* 왜 렌더링되는지 모르겠는데 커스터마이징 하는 법을 몰라서 임시방편으로 추가해놓음! */
.v-input__details {display: none;}
</style>

<script>
export default {
  name: "todoList",
};
</script>
