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

        </tr>
        </thead>
        <tbody>
        <#list users as user>
            <tr>
                <td>${user.email}</td>
                <td>${user.name}</td>
                <td><#list user.role as role>${role}<#sep>, </#list></td>
            </tr>

        </#list>
        </tbody>
    </table>
</@c.page>