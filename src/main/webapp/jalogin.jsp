<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.nw.Global"%>
<%
	boolean debug = Boolean.valueOf(Global.getPropertyValue("debug")).booleanValue();
	String theme = Global.getPropertyValue("theme");
	String version = Global.getResourceVersion();
	String errorMsg = request.getAttribute("errorMsg")==null?"":request.getAttribute("errorMsg").toString();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>物流輸送管理プラットフォーム-登録</title>
		<link href="<%=request.getContextPath() %>/css/login.css" rel="stylesheet" type="text/css" />
		<script src="<%=request.getContextPath() %>/js/jquery/jquery.js"></script>
	</head>
	<body>
		<div class="wrapper">
			<div class="zh"><button>中文</button></div>
			<div class="en"><button>english</button></div>
			<div class="ja"><button>日本語</button></div>
			<div class="logo"><img src="<c:url value="/images/logo-login.png"/>" alt="物流輸送管理プラットフォーム"></div>
			<div class="ic-mod-banner">
				<div id="_banners" class="banners">
					 <div class="banner banner1" style="z-index: 0; opacity: 1;">
					   <img src="<c:url value="/images/login-1.png"/>" alt="">
					</div>
					
					<div class="banner banner2" style="z-index: 0; opacity: 1;">
						<img src="<c:url value="/images/login-2.png"/>" alt="">
					</div>
				</div>
				<div id="_focus" class="focus">
					<a data-index="0" href="#" class="">
						<span class="bg-b"></span>
						<span class="inner"></span>
					</a>
					<a data-index="1" href="#" class="">
						<span class="bg-b"></span>
						<span class="inner"></span>
					</a>
				</div>
			</div>
			<div class="login_form">
				<div class="login_content">
					<h2>TMS登録</h2>
					<ul>
					<form id="login_form" action="login.do" method="post" onSubmit="return formCheck();">
						<li><label>ユーザー名：</label><input type="text" id="user_code" name="user_code" class="login_account" style="font-size:14px"/></li>
						<li><label>パスワード：</label><input type="password" class="login_psw" id="user_password" name="user_password" /></li>
						<li><button type="submit" class="login_btn">安全登録</button>  
							<a href="<c:url value="/express.html"/>" style='text-decoration: underline;font-size: 12px;'>速達の検索</a>&nbsp;
							<a href="<c:url value="/resetPwd.html"/>" style='text-decoration: underline;font-size: 12px;'>パスワードを忘れて？</a>
						</li>
						<input type='hidden' name="service" value="${service}" />
					</form>
					</ul>
				</div>
			</div>
	
		</div>
		<div class="center" align="center">上海閏情報技術有限会社は著作権所有</div>
		<script type="text/javascript">
    var glume = function(banners_id, focus_id){
        this.$ctn = $('#' + banners_id);
        this.$focus = $('#' + focus_id);
        this.$adLis = null;
        this.$btns = null;
        this.switchSpeed = 5;//自动播放间隔(s)
        this.defOpacity = 1;
        this.crtIndex = 0;
        this.adLength = 0;
        this.timerSwitch = null;
        this.init();
    };
    glume.prototype = {
        fnNextIndex:function(){
            return (this.crtIndex >= this.adLength-1)?0:this.crtIndex+1;
        },
        //动画切换
        fnSwitch:function(toIndex){
            if(this.crtIndex==toIndex){return;}
            this.$adLis.css('zIndex', 0);
            this.$adLis.filter(':eq('+this.crtIndex+')').css('zIndex', 2);
            this.$adLis.filter(':eq('+toIndex+')').css('zIndex', 1).css('display', '');
            this.$btns.removeClass('on');
            this.$btns.filter(':eq('+toIndex+')').addClass('on');
            var me = this;

            $(this.$adLis[this.crtIndex]).animate({
                opacity: 0
            }, 1000, function() {
                me.crtIndex = toIndex;
                $(this).css({
                    opacity: me.defOpacity,
                    zIndex: 0
                });
            });
        },
        fnAutoPlay:function(){
            this.fnSwitch(this.fnNextIndex());
        },
        fnPlay:function(){
            var me = this;
            me.timerSwitch && clearInterval(me.timerSwitch);
            me.timerSwitch = window.setInterval(function() {
                me.fnAutoPlay();
            },me.switchSpeed*1000);
        },
        fnStopPlay:function(){
            clearInterval(this.timerSwitch);
            this.timerSwitch = null;
        },

        init:function(){
            this.$adLis = this.$ctn.children();
            this.$btns = this.$focus.children();
            this.adLength = this.$adLis.length;

            var me = this;
            //点击切换
            this.$focus.on('click', 'a', function(e) {
                e.preventDefault();
                var index = parseInt($(this).attr('data-index'), 10)
                me.fnSwitch(index);
            });
            this.$adLis.filter(':eq('+ this.crtIndex +')').css('zIndex', 2);
            this.fnPlay();

            //hover时暂停动画
            this.$ctn.hover(function() {
                me.fnStopPlay();
            }, function() {
                me.fnPlay();
            });

            if($.browser.msie && $.browser.version < 7) {
                this.$btns.hover(function() {
                    $(this).addClass('hover');
                },function() {
                    $(this).removeClass('hover');
                });
            }
        }
    };
    var player1 = new glume('_banners', '_focus');
    
    $(function(){
    	//检测是否有错误信息
    	var errorMsg = '<%=errorMsg%>';
    	if(errorMsg){
    		alert(errorMsg);
    	}
    	
        $('#user_code').bind('keypress',function(event){
            if(event.keyCode == "13"){
                $('#user_password').focus();
            }
        });
        $('#user_password').bind('keypress',function(event){
            if(event.keyCode == "13"){
                $('#login_form').submit();
            }
        });
    });
    
    function formCheck(){
    	var user_code = $('#user_code').val();
    	var user_password = $('#user_password').val();
		if(!user_code){
			$('#user_code').focus();
			alert('ユーザー名は空っぽにならない！');
			return false;
		}
		if(!user_password){
			$('#user_password').focus();
			alert('パスワードは空っぽにならない！');
			return false;
		}
    }
    </script>

	</body>
</html>
