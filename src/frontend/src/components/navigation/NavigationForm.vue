<template>
 <div class="nav_form">
   <div id="nav">
     <div id="nav_contents_box">
       <a href="/waterBank/">
         <img src="@/assets/img/logo.png" id="logo"/>
       </a>
       <div id="nav-contents">
         <div class="menu">
           <ul>
             <li><span class="menu_style"><router-link :to="{ name: 'About'}">About</router-link></span></li>
             <li><span class="menu_style"><router-link :to="{ name: 'Order' }">Order</router-link></span></li>
             <li><span class="menu_style"><router-link :to="{ name: 'Product'}">Product</router-link></span></li>
             <li><span class="menu_style"><router-link :to="{ name: 'Support'}">Support</router-link></span></li>
           </ul>
         </div>
         <div class="member">
           <ul>
             <li><span class="menu_style"><router-link :to="{ name: 'MyPage'}">My Page</router-link></span></li>
             <li><span class="menu_style"><router-link :to="{ name: 'Login'}">Sign in</router-link></span></li>
             <li><span class="menu_style"><router-link :to="{ name: 'MyPage'}">Sign up</router-link></span></li>
           </ul>
         </div>
       </div>
     </div>
   </div>
 </div>
</template>

<script>

export default {
  name: "NavigationForm",
  data() {
    return {
    }
  }
}
</script>

<style scoped>
#nav {
  font-family: BMHANNAAir;
  box-sizing: border-box;
  width: 100%;
  position: fixed;
  left: 0px;
  z-index: 2;
  display: flex;
  -webkit-box-align: center;
  align-items: center;
  border-bottom: 1px solid transparent;
  transition:
      background-color 0.3s linear 0s,
      border 0.3s linear 0s,
      color 0.3s linear 0s,
      fill 0.3s linear 0s;
  top: 0px;
}

#nav:hover {
  background: dodgerblue;
}

#nav_contents_box {
  max-width: 1200px;
  height: 7.2rem;
  margin: 0 auto;
  width: 100%;
  display: flex;
  padding: 0px 16px;
}

#logo {
  width: 82px;
  height: 73px;
}

#nav-contents {
  margin-left: 4.5rem;
  width: 100%;
  display: flex;
}

.menu {
  display: flex;
}

ul {
  list-style: none;
  padding: 0px;
  margin: 0px;
  display: flex;
  -webkit-box-align: center;
  align-items: center;
}

.menu_style {
  font-size: 1.7rem;
  font-weight: 600;
  line-height: 1.7;
  padding: 2.4rem;
}

.member {
  display: flex;
  -webkit-box-align: center;
  align-items: center;
  margin-left: auto;
}
</style>