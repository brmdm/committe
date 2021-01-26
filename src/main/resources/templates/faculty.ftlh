<#include "parts/security.ftlh">
<#import "parts/common.ftlh" as c>
<#import "/spring.ftl" as spring>
<@c.page>
    <@spring.message "faculty.main"/>
    <table>
        <thead>
        <tr>
            <th><@spring.message "faculty.name"/></th>
            <th><@spring.message "main.totalplaces"/></th>
            <th><@spring.message "main.budgetplaces"/></th>
            <th><@spring.message "main.apply"/></th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td>${faculty.title}</td>
                <td>${faculty.allPlaces}</td>
                <td>${faculty.budgetPlaces}</td>

                <td><#if isAdmin>
                    <a href="/faculty/delete?facultyId=${faculty.id}"><@spring.message "faculty.delete"/></a>
                </#if>
                </td>

            </tr>
        </tbody>
    </table>
</@c.page>