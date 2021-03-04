<template>
  <div class="home_form">
    <body>
      <div id="container">
        <navigation-form></navigation-form>
        <div id="main">
          <div id="first_section_background">
            <section id="main_desc">
              <div id="desc">
                <h1>
                  Pay one time!
                </h1>
                <p>
                  한번의 결제로 원하는 때 언제나 <br>
                  간편하게 생수 배달을 시작해보세요!
                </p>
                <div id="main_button">
                  <a href="#" id="order_btn">Order</a>
                  <a href="#" id="reg_btn">Register</a>
                </div>
              </div>
            </section>
            <section id="order_desc">

            </section>
          </div>
        </div>
      </div>
    </body>
  </div>
</template>

<script>
import NavigationForm from "@/components/navigation/NavigationForm";
import pic from "@/assets/img/water_storage.png"

export default {
  name: "HomeForm",
  components: {
    NavigationForm
  },
  data() {
    return {
      pic: pic
    }
  }
}
</script>

<style scoped>
body {
  margin: 0px;
  padding: 0px;
  font-size: 2.6rem;
  font-variant-numeric: lining-nums;
}

#main {
  padding-top: 0px;
}

#first_section_background {
  background-image: url("../../assets/img/water_storage.png");
  background-size: cover;
  background-repeat: no-repeat;
  height: 100vh;
}

#main_desc {
  max-width: 1200px;
  margin: 0 auto;
  padding: 30rem 1.6rem 41rem;
  width: 100%;
  overflow-x: hidden;

}

#desc {
  max-width: 57rem;
  position: relative;
}

#desc h1 {
  margin: 0px 0px 2.4rem;
  font-size: 7.2rem;
  line-height: 8rem;
}

#desc p {
  margin: 0px 0px 4.8rem;
  font-size: 1.8rem;
  line-height: 1.71;
}

#main_button {
  display: flex;
}

#order_btn {
  margin-right: 1.6rem;
  text-decoration: none;
  outline: none;
  cursor: pointer;
  font-weight: 600;
  border: 2px solid dodgerblue;
  width: fit-content;
  display: flex;
  -webkit-box-align: center;
  align-items: center;
  background: dodgerblue;
  min-height: 5.6rem;
  padding: 0px 3.2rem;
  font-size: 2rem;
  line-height: 1.75;
}

#reg_btn {
  color: black;
  text-decoration: none;
  outline: none;
  cursor: pointer;
  font-weight: 600;
  border: 2px solid rgb(217, 226, 239);
  width: fit-content;
  display: flex;
  -webkit-box-align: center;
  align-items: center;
  background: white;
  min-height: 5.6rem;
  padding: 0px 3.2rem;
  font-size: 1.6rem;
  line-height: 1.75;
}

#reg_btn:hover {
  background: rgb(217, 226, 239);
}

#order_btn:hover {
  background: #1370c9;
  border-color: #1370c9;
}
</style>