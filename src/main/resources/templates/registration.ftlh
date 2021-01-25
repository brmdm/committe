<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<#import "/spring.ftl" as spring>
<@c.page>
    <div class="mb-1"><@spring.message "registr.newuser"/></div>

    ${message?ifExists}
<#--<@l.login "/registration" true/>-->
    <form action="/registration" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "user.surname"/> :</label>
            <div class="col-sm-6">
                <input type="text" name="surname" class="form-control" placeholder="<@spring.message "user.surname"/>" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "registr.name"/> :</label>
            <div class="col-sm-6">
                <input type="text" name="name" class="form-control" placeholder="<@spring.message "registr.name"/>" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "registr.fathersname"/> :</label>
            <div class="col-sm-6">
                <input type="text" name="fathersName" class="form-control" placeholder="<@spring.message "registr.fathersname"/>" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "user.region"/> :</label>
            <div class="col-sm-6">
                <input type="text" name="region" class="form-control" placeholder="<@spring.message "user.region"/>" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "user.city"/> :</label>
            <div class="col-sm-6">
                <input type="text" name="city" class="form-control" placeholder="<@spring.message "user.city"/>" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "user.institution"/> :</label>
            <div class="col-sm-6">
                <input type="text" name="institution" class="form-control" placeholder="<@spring.message "user.institution"/>" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "login.user"/> :</label>
            <div class="col-sm-6">
                <input type="text" name="email" class="form-control" placeholder="<@spring.message "login.user"/>" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "login.password"/> :</label>
            <div class="col-sm-6">
                <input type="text" name="password" class="form-control" placeholder="<@spring.message "login.password"/>" />
            </div>
        </div>


        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button class="btn btn-primary" type="submit"><@spring.message "login.create"/></button>
    </form>

</@c.page>