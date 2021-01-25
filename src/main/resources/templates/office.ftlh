<#import "parts/common.ftlh" as c>
<#import "/spring.ftl" as spring>
<#include "parts/security.ftlh">
<@c.page>
<h5><@spring.message "office.yourfaculty"/></h5>
    <table>
        <thead>
        <tr>
            <th>id</th>
            <th>year</th>
            <th>Faculty</th>
        </tr>
        </thead>
        <tbody>
        <#list statements as statement>
            <tr>
                <td>${statement.id}</td>
                <td>${statement.year}</td>
            </tr>

        </#list>
        </tbody>
    </table>

</@c.page>