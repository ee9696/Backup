<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style type="text/css">
#menu__toggle {
  opacity: 1; 
}

#menu__toggle:checked ~ .menu__btn > span {
  transform: rotate(45deg);
}
#menu__toggle:checked ~ .menu__btn > span::before {
  top: 0;
  transform: rotate(0);
}
#menu__toggle:checked ~ .menu__btn > span::after {
  top: 0;
  transform: rotate(90deg);
}
#menu__toggle:checked ~ .menu__box {
  visibility: visible;
  left: 0;
}

.menu__btn {
  display: flex;
  align-items: center;
  position: fixed;
  top: 20px;
  left: 20px;

  width: 26px;
  height: 26px;

  cursor: pointer;
  z-index: 1;
}

.menu__btn > span,
.menu__btn > span::before,
.menu__btn > span::after {
  display: block;
  position: absolute;

  width: 100%;
  height: 2px;

  background-color: #616161;

  transition-duration: .25s;
}
.menu__btn > span::before {
  content: '';
  top: -8px;
}
.menu__btn > span::after {
  content: '';
  top: 8px;
}

.menu__box {
  display: block;
  position: fixed;
  visibility: hidden;
  top: 0;
  left: -100%;

  width: 300px;
  height: 100%;

  margin: 0;
  padding: 80px 0;

  list-style: none;

  background-color: #ECEFF1;
  box-shadow: 1px 0px 6px rgba(0, 0, 0, .2);

  transition-duration: .25s;
}

.menu__item {
  display: block;
  padding: 12px 24px;

  color: #333;

  font-family: 'Roboto', sans-serif;
  font-size: 20px;
  font-weight: 600;

  text-decoration: none;

  transition-duration: .25s;
}
.menu__item:hover {
  background-color: #CFD8DC;
}
</style>
    
    <div class="hamburger-menu">
    <input id="menu__toggle" type="checkbox" autocomplete="off" />
    <label class="menu__btn" for="menu__toggle">
      <span></span>
    </label>

    <ul class="menu__box">
      <li><a class="menu__item" href="#">메뉴1</a></li>
		<li><a class="menu__item" href="#">메뉴2</a></li>
		<li><a class="menu__item" href="#">메뉴3</a></li>
		<li><a class="menu__item" href="#">메뉴4</a></li>
		<li><a class="menu__item" href="#">메뉴5</a></li>
    </ul>
  </div>
<!--     <script>
  function uncheck(){
  	$(':checkbox:checked').prop('checked',false);
  };
  </script> -->
  <body onLoad="uncheck()">
  
  <script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<!--   <script type="text/javascript" src="../js/test.js"></script> -->
