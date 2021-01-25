<#import "parts/common.ftlh" as c>
<#import "/spring.ftl" as spring>
<@c.page>
    <@spring.message "user.list"/>
    <table>
        <thead>
        <tr>
            <th><@spring.message "login.user"/></th>
            <th><@spring.message "user.name"/></th>
            <th><@spring.message "user.role"/></th>
            <th><@spring.message "user.enable"/></th>
            <th><@spring.message "user.block"/></th>
        </tr>
        </thead>
        <tbody>
        <#list users as user>
            <tr>
                <td>${user.email}</td>
                <td>${user.name}</td>
                <td><#list user.role as role>${role}<#sep>, </#list></td>
                <td><#if user.enable>enable<#else>false</#if></td>
                <td><#if user.enable>
                    <a href="/user/disable?userId=${user.id}"><@spring.message "user.disablebutton"/></a>
                <#else>
                    <a href="/user/enable?userId=${user.id}"><@spring.message "user.enablebutton"/></a>
                </#if>
                </td>

            </tr>

        </#list>
        </tbody>
    </table>
</@c.page>